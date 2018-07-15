import java.util.HashMap

class BrickWall {
  fun leastBricks(wall: List<List<Int>>): Int {
    val map = HashMap<Int, Int>()
    for (row in wall) {
      var sum = 0
      for (i in 0 until row.size - 1) {
        sum += row[i]
        if (map.containsKey(sum))
          map.put(sum, map[sum]!! + 1)
        else
          map.put(sum, 1)
      }
    }
    var res = wall.size
    for (key in map.keys)
      res = Math.min(res, wall.size - map[key]!!)
    return res
  }
}