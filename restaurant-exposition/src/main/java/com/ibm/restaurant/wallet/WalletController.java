package com.ibm.restaurant.wallet;

import com.ibm.restaurant.application.wallet.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/wallet")
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping
    public void createWallet(@RequestBody WalletDto wallet){
        //
    }
}
