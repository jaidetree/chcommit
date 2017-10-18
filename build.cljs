(require 'lumo.build.api)

(lumo.build.api/build "src" {:main 'chcommit.core
                             :output-to "lib/index.js"
                             :output-dir "lib/out"
                             :target :nodejs})
