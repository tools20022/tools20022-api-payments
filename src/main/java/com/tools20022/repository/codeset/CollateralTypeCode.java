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
import com.tools20022.repository.codeset.CollateralTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#LetterOfCredit
 * CollateralTypeCode.LetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Cash
 * CollateralTypeCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Securities
 * CollateralTypeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#PhysicalEntities
 * CollateralTypeCode.PhysicalEntities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Insurance
 * CollateralTypeCode.Insurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#StockCertificate
 * CollateralTypeCode.StockCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Bond
 * CollateralTypeCode.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#BankGuarantee
 * CollateralTypeCode.BankGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Other
 * CollateralTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode#Commodity
 * CollateralTypeCode.Commodity}</li>
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
 * <li>"LCRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of collateral."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instrument issued by a bank substituting its name and credit standing for
	 * that of its customer. A letter of credit is a written undertaking of the
	 * bank, issued for the account of a customer (the applicant), to honour a
	 * demand for payment, upon the beneficiary's compliance with the terms and
	 * conditions set forth in the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final CollateralTypeCode LetterOfCredit = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCredit";
			definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "LCRE";
		}
	};
	/**
	 * Collateral type is cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is cash."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Cash = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Collateral type is cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Collateral type is securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is securities."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Securities = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Collateral type is securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Collateral type are physical entities, for example, airplanes for debt
	 * issued by the airline industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalEntities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral type are physical entities, for example, airplanes for debt issued by the airline industry."
	 * </li>
	 * </ul>
	 */
	public static final CollateralTypeCode PhysicalEntities = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalEntities";
			definition = "Collateral type are physical entities, for example, airplanes for debt issued by the airline industry.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Collateral type is an insurance contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Insurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is an insurance contract."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Insurance = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Collateral type is an insurance contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Collateral type is stock certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is stock certificates."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode StockCertificate = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockCertificate";
			definition = "Collateral type is stock certificates.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "STCF";
		}
	};
	/**
	 * Collateral type is bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is bonds."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Bond = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Collateral type is bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Collateral type is a bank guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is a bank guarantee."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode BankGuarantee = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankGuarantee";
			definition = "Collateral type is a bank guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "GBBK";
		}
	};
	/**
	 * Other assets that could be used as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other assets that could be used as collateral."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Other = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other assets that could be used as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Collateral type is commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is commodities."</li>
	 * </ul>
	 */
	public static final CollateralTypeCode Commodity = new CollateralTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Collateral type is commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	final static private LinkedHashMap<String, CollateralTypeCode> codesByName = new LinkedHashMap<>();

	protected CollateralTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LCRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralTypeCode";
				definition = "Specifies the type of collateral.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralTypeCode.LetterOfCredit, com.tools20022.repository.codeset.CollateralTypeCode.Cash,
						com.tools20022.repository.codeset.CollateralTypeCode.Securities, com.tools20022.repository.codeset.CollateralTypeCode.PhysicalEntities, com.tools20022.repository.codeset.CollateralTypeCode.Insurance,
						com.tools20022.repository.codeset.CollateralTypeCode.StockCertificate, com.tools20022.repository.codeset.CollateralTypeCode.Bond, com.tools20022.repository.codeset.CollateralTypeCode.BankGuarantee,
						com.tools20022.repository.codeset.CollateralTypeCode.Other, com.tools20022.repository.codeset.CollateralTypeCode.Commodity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LetterOfCredit.getCodeName().get(), LetterOfCredit);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(PhysicalEntities.getCodeName().get(), PhysicalEntities);
		codesByName.put(Insurance.getCodeName().get(), Insurance);
		codesByName.put(StockCertificate.getCodeName().get(), StockCertificate);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(BankGuarantee.getCodeName().get(), BankGuarantee);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Commodity.getCodeName().get(), Commodity);
	}

	public static CollateralTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralTypeCode[] values() {
		CollateralTypeCode[] values = new CollateralTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralTypeCode> {
		@Override
		public CollateralTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}