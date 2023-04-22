package ruby.pagination;

import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
public class Pagination {

    private final int number;
    private final int totalPages;
    private final int size;
    private final long totalElements;

    public <T> Pagination(Page<T> page) {
        this.number = page.getNumber();
        this.totalPages = page.getTotalPages();
        this.size = page.getSize();
        this.totalElements = page.getTotalElements();
    }

    public Pagination(int number, int totalCount, int size) {
        this.number = number;
        this.totalElements = totalCount;
        this.size = size;
        this.totalPages = totalCount % size == 0
                ? totalCount / size
                : totalCount / size + 1;
    }
}
