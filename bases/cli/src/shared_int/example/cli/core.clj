(ns shared-int.example.cli.core
  (:require [shared-int.example.shared-interface.interface :as shared-interface]))

(defn -main [& args]
  (shared-interface/do-thing!))
