package com.ritk.accounts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsRestController {

    @GetMapping(value = "/account/name")
    public String getAccountName(){
        return "My Account";
    }
}
