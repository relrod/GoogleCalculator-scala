GoogleCalculator for Scala
==========================

This is just a very simple wrapper around Google Calculator, similar to what
WWW::Google::Calculator does for Perl.

Using it
========

```scala
scala> import me.elrod.GoogleCalculator._
import me.elrod.GoogleCalculator._

scala> GoogleCalculator.calculate("2 + 2")
res0: String = 2 + 2 = 4

scala> GoogleCalculator.calculate("3 GB to MB")
res1: String = 3 gigabytes = 3072 megabytes

scala> GoogleCalculator.calculate("pi")
res2: String = pi = 3.14159265
```

License
=======

3-clause BSD, same as Scala itself.

Contributions
=============

Glady accepted!
