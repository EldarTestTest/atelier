package com.dreamteam.atelier.controller.rest;

import com.dreamteam.atelier.model.domain.Basket;
import com.dreamteam.atelier.model.local.UserBasket;
import com.dreamteam.atelier.service.BasketService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rest/basket")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Basket>> getAllBaskets() {
        return new ResponseEntity<>(basketService.getAllBaskets(), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ResponseEntity<Basket> createBasket() {
        return new ResponseEntity<>(basketService.createBasket(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public ResponseEntity<Basket> getBasketById(@RequestBody UserBasket userBasket) {
        return new ResponseEntity<>(basketService.getBasket(userBasket.getId()), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByUuid", method = RequestMethod.POST)
    public ResponseEntity<Basket> getBasketByUuid(@RequestBody UserBasket userBasket) {
        return new ResponseEntity<>(basketService.getBasket(userBasket.getUuid()), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByIdAndUuid", method = RequestMethod.POST)
    public ResponseEntity<Basket> getBasketByIdAndUuid(@RequestBody UserBasket userBasket) {
        return new ResponseEntity<>(basketService.getBasket(userBasket.getId(), userBasket.getUuid()), HttpStatus.OK);
    }

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public ResponseEntity<Boolean> addItemToBasket(@RequestBody UserBasket userBasket){
        basketService.addItem(userBasket.getId(), userBasket.getItemId());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteItem", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteItemFromBasket(@RequestBody UserBasket userBasket){
        basketService.deleteItem(userBasket.getId(), userBasket.getItemId());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteAllItemsById", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteAllItemsFromBasketById(@RequestBody UserBasket userBasket ) {
        basketService.deleteItemsFromBasket(userBasket.getId());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteAllItemsByUuid", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteAllItemsFromBasketByUuid(@RequestBody UserBasket userBasket) {
        basketService.deleteItemsFromBasket(userBasket.getUuid());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteById(@RequestBody UserBasket userBasket){
        basketService.deleteBasketById(userBasket.getId());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteByUuid", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteByUuid(@RequestBody UserBasket userBasket){
        basketService.deleteBasketByUuid(userBasket.getUuid());
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
