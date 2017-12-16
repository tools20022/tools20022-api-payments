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
import com.tools20022.repository.codeset.ChequeType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of cheque.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code#CustomerCheque
 * ChequeType2Code.mmCustomerCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code#CertifiedCustomerCheque
 * ChequeType2Code.mmCertifiedCustomerCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeType2Code#BankCheque
 * ChequeType2Code.mmBankCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeType2Code#Draft
 * ChequeType2Code.mmDraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code#ElectronicDraft
 * ChequeType2Code.mmElectronicDraft}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChequeTypeCode ChequeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CCHQ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of cheque."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChequeType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCheque"</li>
	 * </ul>
	 */
	public static final ChequeType2Code CustomerCheque = new ChequeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCheque";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeType2Code.mmObject();
			codeName = ChequeTypeCode.CustomerCheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertifiedCustomerCheque"</li>
	 * </ul>
	 */
	public static final ChequeType2Code CertifiedCustomerCheque = new ChequeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedCustomerCheque";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeType2Code.mmObject();
			codeName = ChequeTypeCode.CertifiedCustomerCheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankCheque"</li>
	 * </ul>
	 */
	public static final ChequeType2Code BankCheque = new ChequeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCheque";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeType2Code.mmObject();
			codeName = ChequeTypeCode.BankCheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Draft"</li>
	 * </ul>
	 */
	public static final ChequeType2Code Draft = new ChequeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Draft";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeType2Code.mmObject();
			codeName = ChequeTypeCode.Draft.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeType2Code
	 * ChequeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicDraft"</li>
	 * </ul>
	 */
	public static final ChequeType2Code ElectronicDraft = new ChequeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDraft";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeType2Code.mmObject();
			codeName = ChequeTypeCode.ElectronicDraft.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChequeType2Code> codesByName = new LinkedHashMap<>();

	protected ChequeType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CCHQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequeType2Code";
				definition = "Specifies the type of cheque.";
				trace_lazy = () -> ChequeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeType2Code.CustomerCheque, com.tools20022.repository.codeset.ChequeType2Code.CertifiedCustomerCheque,
						com.tools20022.repository.codeset.ChequeType2Code.BankCheque, com.tools20022.repository.codeset.ChequeType2Code.Draft, com.tools20022.repository.codeset.ChequeType2Code.ElectronicDraft);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CustomerCheque.getCodeName().get(), CustomerCheque);
		codesByName.put(CertifiedCustomerCheque.getCodeName().get(), CertifiedCustomerCheque);
		codesByName.put(BankCheque.getCodeName().get(), BankCheque);
		codesByName.put(Draft.getCodeName().get(), Draft);
		codesByName.put(ElectronicDraft.getCodeName().get(), ElectronicDraft);
	}

	public static ChequeType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChequeType2Code[] values() {
		ChequeType2Code[] values = new ChequeType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChequeType2Code> {
		@Override
		public ChequeType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChequeType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}