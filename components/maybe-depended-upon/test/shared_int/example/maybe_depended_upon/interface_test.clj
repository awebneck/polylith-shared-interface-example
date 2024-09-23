(ns shared-int.example.maybe-depended-upon.interface-test
  (:require [clojure.test :as test :refer :all]
            [shared-int.example.maybe-depended-upon.interface :as maybe-depended-upon]))

(deftest dummy-test
  (is (= 1 1)))
