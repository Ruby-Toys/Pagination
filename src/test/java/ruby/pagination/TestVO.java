package ruby.pagination;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class TestVO {

    private List<String> dataList;
    private Pagination pagination;

    public TestVO(Page<String> page) {
        this.dataList = page.getContent();
        this.pagination = new Pagination(page);
    }

    public TestVO(List<String> dataList, int number, int totalCount, int size) {
        this.dataList = dataList;
        this.pagination = new Pagination(number, totalCount, size);
    }
}
