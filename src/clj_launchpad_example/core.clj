(ns clj-launchpad-example.core
    (:use [overtone.live]
	  [clj-launchpad]))

(def lpad (open))

; more info on draw-grid can be found here:
; https://github.com/moumar/clj-launchpad/blob/master/src/clj_launchpad.clj#L12
(draw-grid lpad 3 3 :red :high)

; use on-grid-pressed or overtone's built-in on-event midi handler to respond to button presses.

