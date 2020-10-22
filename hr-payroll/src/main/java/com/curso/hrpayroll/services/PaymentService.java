package com.curso.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.hrpayroll.entities.Payment;
import com.curso.hrpayroll.entities.Worker;
import com.curso.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long idWorker, int days) {

		Worker worker = workerFeignClient.findById(idWorker).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
