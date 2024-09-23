(ns shared-int.example.do-thing-one.interface-test
  (:require [clojure.test :as test :refer :all]
            [shared-int.example.do-thing-one.interface :as do-thing-one]))

(deftest dummy-test
  (is (= 1 1)))
