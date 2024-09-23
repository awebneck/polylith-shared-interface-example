(ns shared-int.example.shared-interface.core
  (:require [shared-int.example.maybe-depended-upon.interface :as mdu]))

(defn do-thing! []
  (println "Doing a different thing!")
  (mdu/do-another-thing!))
