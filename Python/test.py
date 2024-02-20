import unittest
from main import isPrime

class Test(unittest.TestCase):
    def test1(self):
        self.assertEqual(isPrime(1), False)

    def test2(self):
        self.assertEqual(isPrime(2), True)

    def test3(self):
        self.assertEqual(isPrime(3), True)

    def test4(self):
        self.assertEqual(isPrime(4), False)

    def test5(self):
        self.assertEqual(isPrime(5), True)

    def test6(self):
        self.assertEqual(isPrime(6), False)

    def test7(self):
        self.assertEqual(isPrime(7), True)

    def test8(self):
        self.assertEqual(isPrime(8), False)

    def test9(self):
        self.assertEqual(isPrime(9), False)

    def test10(self):
        self.assertEqual(isPrime(10), False)

if __name__ == "__main__":
    unittest.main()



