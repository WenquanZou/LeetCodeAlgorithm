class Solution(object):
    def gray_code(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        if n == 0:
            return [0]
        result_start = self.gray_code(n - 1)

        # Append 1 + result_start(reversed)
        new_bit = 1 << (n - 1)
        result_end = [x | new_bit for x in result_start[::-1]]

        # Combine start and end halves, and return.
        result_start.extend(result_end)
        return result_start
