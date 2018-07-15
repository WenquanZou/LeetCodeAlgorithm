import java.util.ArrayList

class TreeNode(var `val`: Int = 0) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}

class ClosetBinarySearchTree {

  var res: MutableList<Int> = ArrayList()
  fun closestKValues(root: TreeNode?, target: Double, k: Int): List<Int> {
    if (root == null) return res
    closestKValues(root.left, target, k)
    if (res.size < k)
      res.add(root.`val`)
    else {
      if (Math.abs(target - res[0]) > Math.abs(target - root.`val`)) {
        res.removeAt(0)
        res.add(root.`val`)
      } else
        return res
    }
    closestKValues(root.right, target, k)
    return res
  }
}

