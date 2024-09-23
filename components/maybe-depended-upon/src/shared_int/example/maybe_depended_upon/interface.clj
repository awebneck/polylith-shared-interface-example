(ns shared-int.example.maybe-depended-upon.interface
  (:require [shared-int.example.maybe-depended-upon.core :as core]))

(def do-another-thing! []
  (core/do-another-thing!))
