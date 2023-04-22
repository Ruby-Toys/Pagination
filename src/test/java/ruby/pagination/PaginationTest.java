package ruby.pagination;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class PaginationTest {

    @Test
    @DisplayName("페이지 번호, 총 개수, 페이지 크기로 Pagination 객체 생성")
    void testPageParams() {
        int number = 3;
        int size = 20;
        int totalCount = 95;
        List<String> dataList = new ArrayList<>();
        for (int i = 0; i < totalCount; i++) {
            dataList.add("test" + i);
        }

        List<String> content = dataList.subList(40, 60);
        TestVO testVO = new TestVO(content, number, totalCount, size);

        assertThat(testVO.getDataList()).isEqualTo(content);
        assertThat(testVO.getPagination().getNumber()).isEqualTo(number);
        assertThat(testVO.getPagination().getSize()).isEqualTo(size);
        assertThat(testVO.getPagination().getTotalElements()).isEqualTo(totalCount);
        assertThat(testVO.getPagination().getTotalPages()).isEqualTo(totalCount / size + 1);
    }
}