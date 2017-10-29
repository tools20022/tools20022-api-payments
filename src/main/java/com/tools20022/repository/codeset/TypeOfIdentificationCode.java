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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
public class TypeOfIdentificationCode {

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
	public static final MMCode AlienRegistrationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode PassportNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode TaxExemptIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptIdentificationNumber";
			definition = "Number assigned to a tax exempt entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode CorporateIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateIdentification";
			definition = "Number assigned to a corporate entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode DriverLicenseNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseNumber";
			definition = "Number assigned to a driver's license.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode ForeignInvestmentIdentityNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			definition = "Number assigned to a foreign investor (other than the alien number).";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
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
	public static final MMCode TaxIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "TXID";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ARNU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
}