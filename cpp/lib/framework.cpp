﻿#include "pch.h"
#include "framework.h"


bool isPrime(int n) {
	if (n <= 1) return false;

	for (int i = 2; i < n; i++)
	{
		if (n % i == 0) return false;
	}

	return true;
}
