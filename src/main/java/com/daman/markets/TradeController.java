package com.daman.markets;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/trade")
public class TradeController {

    @PostMapping("/buy")
    public Map<String, Object> buyStock(@RequestParam String symbol, @RequestParam int quantity) {
        // Simulating a trade execution for Daman Markets
        Map<String, Object> response = new HashMap<>();
        response.put("status", "EXECUTED");
        response.put("symbol", symbol);
        response.put("quantity", quantity);
        response.put("price", Math.random() * 100); // Mock price
        response.put("brokerage", "0.0 USD"); // Free tier brokerage
        return response;
    }

    @GetMapping("/health")
    public String health() {
        return "Trade Engine is Running - Daman Markets";
    }
}
