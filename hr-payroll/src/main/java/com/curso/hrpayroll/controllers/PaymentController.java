package com.curso.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.hrpayroll.entities.Payment;
import com.curso.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	private PaymentService service;

	@GetMapping(value = "/{idWorker}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long idWorker, @PathVariable Integer days) {
		Payment payment = service.getPayment(idWorker, days);
		return ResponseEntity.ok(payment);
	}
}
