class Named(object):
    def __init__(self, name):
        self.name = name

    def greet(self):
        print 'my name is ' + self.name

class Flying(object):
    def __init__(self, wings):
        self.wings = wings

    def fly(self):
        print 'I can fly with my ' + `self.wings` + ' wings'

class Bird(Flying, Named):
    def __init__(self, name, wings):
        Flying.__init__(self, wings)
        Named.__init__(self, name)

# x = Named('george')
# x.greet();

y = Bird('flappy', 2)
y.greet()
y.fly()
