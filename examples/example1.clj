( let [ x ( sample ( gamma 1.0 1.0))
       d ( bernoulli x )]
  ( observe d 1)
  x)
