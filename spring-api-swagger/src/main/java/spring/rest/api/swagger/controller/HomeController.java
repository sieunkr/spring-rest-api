package spring.rest.api.swagger.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.api.swagger.dto.Coffee;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @ApiOperation(value = "커피 조회")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "커피 종류", required = true, dataType = "string", paramType = "path", defaultValue = ""),
    })
    @RequestMapping(value = "/coffees/{type}", method = RequestMethod.GET)
    public List<Coffee> selectListBoard(@PathVariable("type") String type) {

        List<Coffee> coffeeList = Arrays.asList(new Coffee("라떼", 1200), new Coffee("모카", 1800));

        return coffeeList;
    }
}
