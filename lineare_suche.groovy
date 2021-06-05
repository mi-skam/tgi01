/* groovylint-disable DuplicateNumberLiteral */
@groovy.transform.CompileStatic

boolean lineareSuche(int w, int[] l) {
  int i = 0
  while (i < l.size()) {
    if (l[i] == w) {
      return true
    }
    i++
  }
  return false
}
// test1
// w = 4
// L2 = [] // empty list raises missingPropertyException
// println(lineareSuche(w, L))

// test2
int w = 44
int[] l = [2]
println(lineareSuche(w, l))

// test3
l = [44]
println(lineareSuche(w, l))

// test4
l = [2, 3, 4, 5, 44, 9, 33]
println(lineareSuche(w, l))
