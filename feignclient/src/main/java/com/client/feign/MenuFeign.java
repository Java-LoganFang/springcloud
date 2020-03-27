package com.client.feign;//package com.feign;

import com.client.entity.Menu;
import com.client.entity.MenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    public MenuVO  findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);
}
