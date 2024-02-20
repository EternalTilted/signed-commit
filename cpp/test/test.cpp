#include "pch.h"
#include "..\lib\framework.h"

TEST(TestCaseName, TestName1) 
{
  EXPECT_EQ(isPrime(1), false);
}

TEST(TestCaseName, TestName2)
{
	EXPECT_EQ(isPrime(2), true);
}

TEST(TestCaseName, TestName3)
{
	EXPECT_EQ(isPrime(3), true);
}

TEST(TestCaseName, TestName4)
{
	EXPECT_EQ(isPrime(4), false);
}

TEST(TestCaseName, TestName5)
{
	EXPECT_EQ(isPrime(5), true);
}

TEST(TestCaseName, TestName6)
{
	EXPECT_EQ(isPrime(6), false);
}

TEST(TestCaseName, TestName7)
{
	EXPECT_EQ(isPrime(7), true);
}

TEST(TestCaseName, TestName8)
{
	EXPECT_EQ(isPrime(8), false);
}

TEST(TestCaseName, TestName9)
{
	EXPECT_EQ(isPrime(9), false);
}

TEST(TestCaseName, TestName10)
{
	EXPECT_EQ(isPrime(10), false);
}