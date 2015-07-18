class First(object):
    def __init__(self):
        print "first"
        super(First, self).__init__()

class Second(First):
    def __init__(self):
        print "second"
        super(Second, self).__init__()

class Third(First):
    def __init__(self):
        print "third"
        super(Third, self).__init__()

class Fourth(Second, Third):
    def __init__(self):
        print "fourth"
        super(Fourth, self).__init__()

Fourth()
