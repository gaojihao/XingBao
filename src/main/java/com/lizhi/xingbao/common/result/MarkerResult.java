package com.lizhi.xingbao.common.result;

import com.lizhi.xingbao.common.request.query.MarkerPaged;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class MarkerResult<T> extends BaseResult<List<T>> {
    private static final long serialVersionUID = -3142517189645630831L;

    private String nextMarker;

    public boolean hasNextPage() {
        return nextMarker != null;
    }

    public MarkerResult setData(List dataPlus, MarkerPaged paged, Function<T, String> markerFunction) {
        if (dataPlus == null) {
            this.nextMarker = null;
            return this;
        }

        if (dataPlus.size() > paged.findLimit()) {
            throw new RuntimeException("more than limit");
        }

        List list = new ArrayList(dataPlus.size());

        if (dataPlus.size() == paged.findLimit()) {
            list.addAll(dataPlus.subList(0, paged.findLimit() - 1));

            T last = (T) dataPlus.get(paged.findLimit() - 1);
            this.nextMarker  =markerFunction.apply(last);
        }else {
            list.addAll(dataPlus);
            this.nextMarker = null;
        }

        if (!paged.isForward()) {
            Collections.reverse(list);
        }

        this.setData(list);

        return this;
    }

    @Override
    public List<T> getData() {
        return super.getData();
    }
}
