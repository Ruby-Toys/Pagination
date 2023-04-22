package ruby.pagination;

import lombok.Getter;

@Getter
public class Pagination {

    private final int number;
    private final int totalPages;
    private final int size;
    private final long totalElements;

    public Pagination(int number, int totalCount, int size) {
        this.number = number;
        this.totalElements = totalCount;
        this.size = size;
        this.totalPages = totalCount % size == 0
                ? totalCount / size
                : totalCount / size + 1;
    }
}
