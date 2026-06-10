import numpy as np

M = np.array([[2,1],[5,3]]) 
 
print(np.linalg.det(M))
print(np.transpose(M))
print(np.linalg.eig(M)[0])
print(np.linalg.inv(M))