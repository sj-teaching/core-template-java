JFLAGS = -g
JC = javac

PKG = core

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES := $(shell ls $(PKG)/*.java)

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $(PKG)/*.class *.jar $(PKG)/*.xmi
