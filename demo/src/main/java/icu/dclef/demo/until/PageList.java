package icu.dclef.demo.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
/**
 * 分页工具类
 *
 * @author dclef
 * @since 2022-02-05 17:29:40
 */
@Data
//全参数构造器
@AllArgsConstructor
//无参构造器
@NoArgsConstructor
public class PageList<T> {
    /**
     * 计算总条数
     */
    private  Long total;
   
    /**
     * 列表展示
     */
    private  List<T> rows=new ArrayList<>();

}