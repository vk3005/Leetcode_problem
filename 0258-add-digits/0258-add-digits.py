class Solution(object):
    def addDigits(self, num):
        return 1 + (num - 1) % 9 if num else 0
        