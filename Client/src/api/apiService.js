import axios from 'axios';

const API_BASE_URL = 'jdbc:mysql://aws.connect.psdb.cloud/prescription?sslMode=VERIFY_IDENTITY';

const apiService = {
    getAllMedication: async () => {
        try {
            const response = await axios.get(`${API_BASE_URL}/api/medication`);
            return response.data;
        } catch (error) {
            throw error;
        }
    },
    createData: (newData) => {
        return axios.post(`${API_BASE_URL}/data`, newData);
    }
};

export default apiService;