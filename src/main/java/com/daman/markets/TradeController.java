package com.daman.markets;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/trade")
public class TradeController {

    // Endpoint 1: Health Check
    @GetMapping("/health")
    public String health() {
        return "Daman Markets Trade Engine: RUNNING";
    }

    // Endpoint 2: Portfolio (The one giving you 404)
    @GetMapping("/portfolio")
    public Map<String, Object> getPortfolio() {
        Map<String, Object> portfolio = new HashMap<>();
        portfolio.put("user", "Raj Debnath");
        portfolio.put("balance", "5000.00 USD");
        portfolio.put("holdings", new String[]{"BTC", "ETH", "AAPL"});
        portfolio.put("status", "ACTIVE");
        return portfolio;
    }

    // Endpoint 3: Buy Stock (Bonus)
    @PostMapping("/buy")
    public Map<String, Object> buyStock(@RequestParam String symbol, @RequestParam int quantity) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "EXECUTED");
        response.put("symbol", symbol);
        response.put("quantity", quantity);
        response.put("brokerage", "0.0 USD");
        return response;
    }
}
