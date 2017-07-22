package com.jacoli.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jacoli.DO.BillRecord;
import com.jacoli.DO.BillType;
import com.jacoli.mappers.BillRecordMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lichuange on 2017/7/22.
 */
@Controller
@RequestMapping("/bills")
public class BillController {
    private Logger logger = LoggerFactory.getLogger(BillController.class);

    @Autowired
    private BillRecordMapper billRecordMapper;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    @ResponseBody
    public String insert(long fee_cent, @RequestParam(defaultValue = "0") int type, String note, String category) {
        BillRecord record = new BillRecord();
        record.setUser_id(2);
        record.setType(type == 0 ? BillType.Income : BillType.Expenditure);
        record.setFee_cent(fee_cent);
        record.setNote(note);
        record.setCategory(category);

        return billRecordMapper.insert(record) > 0 ? "success" : "failed";
    }

    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        List<BillRecord> records = billRecordMapper.getAll();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(records);
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    @ResponseBody
    public String sum() {
        List<BillRecord> records = billRecordMapper.getAll();
        long sum = records.stream()
                .map(record -> record.getType() == BillType.Income ? record.getFee_cent() : -record.getFee_cent())
                .reduce(0L, (a, b) -> a + b);
        return String.valueOf(sum);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public String count() {
        List<BillRecord> records = billRecordMapper.getAll();
        long sum = records.stream().filter(record -> record.getType() == BillType.Income).count();
        return String.valueOf(sum);
    }
}
