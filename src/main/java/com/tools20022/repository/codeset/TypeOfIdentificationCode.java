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
import com.tools20022.repository.codeset.TypeOfIdentificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of alternate identification which can be used to give an
 * alternate identification of the party identified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#AlienRegistrationNumber
 * TypeOfIdentificationCode.AlienRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#PassportNumber
 * TypeOfIdentificationCode.PassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#TaxExemptIdentificationNumber
 * TypeOfIdentificationCode.TaxExemptIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#CorporateIdentification
 * TypeOfIdentificationCode.CorporateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#DriverLicenseNumber
 * TypeOfIdentificationCode.DriverLicenseNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#ForeignInvestmentIdentityNumber
 * TypeOfIdentificationCode.ForeignInvestmentIdentityNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode#TaxIdentificationNumber
 * TypeOfIdentificationCode.TaxIdentificationNumber}</li>
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
 * <li>"ARNU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfIdentificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlienRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a government agency to identify foreign nationals."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode AlienRegistrationNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "ARNU";
		}
	};
	/**
	 * Number assigned by a passport authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a passport authority."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode PassportNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "CCPT";
		}
	};
	/**
	 * Number assigned to a tax exempt entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to a tax exempt entity."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode TaxExemptIdentificationNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptIdentificationNumber";
			definition = "Number assigned to a tax exempt entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "CHTY";
		}
	};
	/**
	 * Number assigned to a corporate entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to a corporate entity."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode CorporateIdentification = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateIdentification";
			definition = "Number assigned to a corporate entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Number assigned to a driver's license.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DriverLicenseNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned to a driver's license."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode DriverLicenseNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseNumber";
			definition = "Number assigned to a driver's license.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "DRLC";
		}
	};
	/**
	 * Number assigned to a foreign investor (other than the alien number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignInvestmentIdentityNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned to a foreign investor (other than the alien number)."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode ForeignInvestmentIdentityNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			definition = "Number assigned to a foreign investor (other than the alien number).";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "FIIN";
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final TypeOfIdentificationCode TaxIdentificationNumber = new TypeOfIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfIdentificationCode.mmObject();
			codeName = "TXID";
		}
	};
	final static private LinkedHashMap<String, TypeOfIdentificationCode> codesByName = new LinkedHashMap<>();

	protected TypeOfIdentificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ARNU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfIdentificationCode";
				definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfIdentificationCode.AlienRegistrationNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.PassportNumber,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.TaxExemptIdentificationNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.CorporateIdentification,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.DriverLicenseNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.ForeignInvestmentIdentityNumber,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.TaxIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AlienRegistrationNumber.getCodeName().get(), AlienRegistrationNumber);
		codesByName.put(PassportNumber.getCodeName().get(), PassportNumber);
		codesByName.put(TaxExemptIdentificationNumber.getCodeName().get(), TaxExemptIdentificationNumber);
		codesByName.put(CorporateIdentification.getCodeName().get(), CorporateIdentification);
		codesByName.put(DriverLicenseNumber.getCodeName().get(), DriverLicenseNumber);
		codesByName.put(ForeignInvestmentIdentityNumber.getCodeName().get(), ForeignInvestmentIdentityNumber);
		codesByName.put(TaxIdentificationNumber.getCodeName().get(), TaxIdentificationNumber);
	}

	public static TypeOfIdentificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfIdentificationCode[] values() {
		TypeOfIdentificationCode[] values = new TypeOfIdentificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfIdentificationCode> {
		@Override
		public TypeOfIdentificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfIdentificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}