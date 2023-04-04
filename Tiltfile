# Build
custom_build(
  ref = 'edge-service',
  command = './gradlew bootBuildImage --imageName $EXPECTED_REF',
  deps = ['build.gradle', './bin/main'],
  live_update = [
    sync('./bin/main', '/workspace/BOOT-INF/classes')
  ]
)

# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml', 'k8s/ingress.yml'])

# Manage
k8s_resource('edge-service', port_forwards=['9000'])