package com.curso.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.curso.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long idWorker, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
