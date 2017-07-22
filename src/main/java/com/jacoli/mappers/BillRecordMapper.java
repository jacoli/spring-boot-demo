package com.jacoli.mappers;

import com.jacoli.DO.BillRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by lichuange on 2017/7/22.
 */
@Repository
@Mapper
public interface BillRecordMapper {
    int insert(@NotNull BillRecord record);
    List<BillRecord> getAll();
}
