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
import com.tools20022.repository.codeset.InvestorTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of investor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestorTypeCode#Retail
 * InvestorTypeCode.Retail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode#Professional
 * InvestorTypeCode.Professional}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestorTypeCode#Staff
 * InvestorTypeCode.Staff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode#PhysicalPerson
 * InvestorTypeCode.PhysicalPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode#Institutional
 * InvestorTypeCode.Institutional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode#RetailAndInstitutional
 * InvestorTypeCode.RetailAndInstitutional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode#GrossDistribution
 * InvestorTypeCode.GrossDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestorTypeCode#Qualified
 * InvestorTypeCode.Qualified}</li>
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
 * <li>"RETL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestorTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of investor."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestorTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor is a retail investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is a retail investor."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode Retail = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Retail";
			definition = "Investor is a retail investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "RETL";
		}
	};
	/**
	 * Investor is a professional or institutional investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Professional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is a professional or institutional investor."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode Professional = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Professional";
			definition = "Investor is a professional or institutional investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "PROF";
		}
	};
	/**
	 * Investor is an employee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Staff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is an employee."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode Staff = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Staff";
			definition = "Investor is an employee.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "STAF";
		}
	};
	/**
	 * Investor is a physical person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is a physical person."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode PhysicalPerson = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhysicalPerson";
			definition = "Investor is a physical person.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "PPER";
		}
	};
	/**
	 * Investor is an institutional investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Institutional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor is an institutional investor."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode Institutional = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Institutional";
			definition = "Investor is an institutional investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "INST";
		}
	};
	/**
	 * Investor is both an institutional and an individual investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailAndInstitutional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is both an institutional and an individual investor."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode RetailAndInstitutional = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailAndInstitutional";
			definition = "Investor is both an institutional and an individual investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "BOTH";
		}
	};
	/**
	 * Investor is eligible to receive income gross, eg, a pension scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investor is eligible to receive income gross, eg, a pension scheme."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode GrossDistribution = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDistribution";
			definition = "Investor is eligible to receive income gross, eg, a pension scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Investor meets the fund entry policy restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor meets the fund entry policy restriction."</li>
	 * </ul>
	 */
	public static final InvestorTypeCode Qualified = new InvestorTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualified";
			definition = "Investor meets the fund entry policy restriction.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorTypeCode.mmObject();
			codeName = "QUAL";
		}
	};
	final static private LinkedHashMap<String, InvestorTypeCode> codesByName = new LinkedHashMap<>();

	protected InvestorTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RETL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestorTypeCode";
				definition = "Specifies the type of investor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorTypeCode.Retail, com.tools20022.repository.codeset.InvestorTypeCode.Professional, com.tools20022.repository.codeset.InvestorTypeCode.Staff,
						com.tools20022.repository.codeset.InvestorTypeCode.PhysicalPerson, com.tools20022.repository.codeset.InvestorTypeCode.Institutional, com.tools20022.repository.codeset.InvestorTypeCode.RetailAndInstitutional,
						com.tools20022.repository.codeset.InvestorTypeCode.GrossDistribution, com.tools20022.repository.codeset.InvestorTypeCode.Qualified);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Retail.getCodeName().get(), Retail);
		codesByName.put(Professional.getCodeName().get(), Professional);
		codesByName.put(Staff.getCodeName().get(), Staff);
		codesByName.put(PhysicalPerson.getCodeName().get(), PhysicalPerson);
		codesByName.put(Institutional.getCodeName().get(), Institutional);
		codesByName.put(RetailAndInstitutional.getCodeName().get(), RetailAndInstitutional);
		codesByName.put(GrossDistribution.getCodeName().get(), GrossDistribution);
		codesByName.put(Qualified.getCodeName().get(), Qualified);
	}

	public static InvestorTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestorTypeCode[] values() {
		InvestorTypeCode[] values = new InvestorTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestorTypeCode> {
		@Override
		public InvestorTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestorTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}