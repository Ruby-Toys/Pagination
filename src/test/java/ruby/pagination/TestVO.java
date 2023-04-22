package ruby.pagination;

import lombok.Data;

import java.util.List;

@Data
public class TestVO {

    private List<String> dataList;
    private Pagination pagination;

    public TestVO(List<String> dataList, int number, int totalCount, int size) {
        this.dataList = dataList;
        this.pagination = new Pagination(number, totalCount, size);
    }
}
