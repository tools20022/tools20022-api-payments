/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataSetTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of data set that is matched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetTypeCode#Baseline
 * DataSetTypeCode.Baseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode#TransportDataSet
 * DataSetTypeCode.TransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode#CommercialDataSet
 * DataSetTypeCode.CommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode#InsuranceDataSet
 * DataSetTypeCode.InsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode#CertificateDataSet
 * DataSetTypeCode.CertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode#OtherCertificateDataSet
 * DataSetTypeCode.OtherCertificateDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BASE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of data set that is matched."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data set is a baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is a baseline."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode Baseline = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Data set is a baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "BASE";
		}
	};
	/**
	 * Data set is a transport data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is a transport data set."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode TransportDataSet = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Data set is a transport data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "TRDS";
		}
	};
	/**
	 * Data set is a commercial data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CODS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is a commercial data set."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode CommercialDataSet = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Data set is a commercial data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "CODS";
		}
	};
	/**
	 * Data set is an insurance data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is an insurance data set."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode InsuranceDataSet = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Data set is an insurance data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "INDS";
		}
	};
	/**
	 * Data set is a certificate data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is a certificate data set."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode CertificateDataSet = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Data set is a certificate data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "CEDS";
		}
	};
	/**
	 * Data set is an other special certificate data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set is an other special certificate data set."</li>
	 * </ul>
	 */
	public static final DataSetTypeCode OtherCertificateDataSet = new DataSetTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Data set is an other special certificate data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetTypeCode.mmObject();
			codeName = "OCDS";
		}
	};
	final static private LinkedHashMap<String, DataSetTypeCode> codesByName = new LinkedHashMap<>();

	protected DataSetTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BASE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetTypeCode";
				definition = "Specifies the type of data set that is matched.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetTypeCode.Baseline, com.tools20022.repository.codeset.DataSetTypeCode.TransportDataSet,
						com.tools20022.repository.codeset.DataSetTypeCode.CommercialDataSet, com.tools20022.repository.codeset.DataSetTypeCode.InsuranceDataSet, com.tools20022.repository.codeset.DataSetTypeCode.CertificateDataSet,
						com.tools20022.repository.codeset.DataSetTypeCode.OtherCertificateDataSet);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Baseline.getCodeName().get(), Baseline);
		codesByName.put(TransportDataSet.getCodeName().get(), TransportDataSet);
		codesByName.put(CommercialDataSet.getCodeName().get(), CommercialDataSet);
		codesByName.put(InsuranceDataSet.getCodeName().get(), InsuranceDataSet);
		codesByName.put(CertificateDataSet.getCodeName().get(), CertificateDataSet);
		codesByName.put(OtherCertificateDataSet.getCodeName().get(), OtherCertificateDataSet);
	}

	public static DataSetTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetTypeCode[] values() {
		DataSetTypeCode[] values = new DataSetTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetTypeCode> {
		@Override
		public DataSetTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}