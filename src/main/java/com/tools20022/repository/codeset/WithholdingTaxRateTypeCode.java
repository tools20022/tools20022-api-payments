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
import com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of withholding tax rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode#FATCATax
 * WithholdingTaxRateTypeCode.mmFATCATax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode#NRATax
 * WithholdingTaxRateTypeCode.mmNRATax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode#BackUpWithholding
 * WithholdingTaxRateTypeCode.mmBackUpWithholding}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WithholdingTaxRateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of withholding tax rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WithholdingTaxRateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Withholding tax related to income subject to FATCA (Foreign Account Tax
	 * Compliance Act).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCATax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withholding tax related to income subject to FATCA (Foreign Account Tax Compliance Act)."
	 * </li>
	 * </ul>
	 */
	public static final WithholdingTaxRateTypeCode FATCATax = new WithholdingTaxRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCATax";
			definition = "Withholding tax related to income subject to FATCA (Foreign Account Tax Compliance Act).";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.mmObject();
			codeName = "FTCA";
		}
	};
	/**
	 * Withholding tax related to income subject to NRA (Non Resident Alien).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withholding tax related to income subject to NRA (Non Resident Alien)."</li>
	 * </ul>
	 */
	public static final WithholdingTaxRateTypeCode NRATax = new WithholdingTaxRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATax";
			definition = "Withholding tax related to income subject to NRA (Non Resident Alien).";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.mmObject();
			codeName = "NRAT";
		}
	};
	/**
	 * Withholding tax related to payments subject to back up withholding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpWithholding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withholding tax related to payments subject to back up withholding."</li>
	 * </ul>
	 */
	public static final WithholdingTaxRateTypeCode BackUpWithholding = new WithholdingTaxRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpWithholding";
			definition = "Withholding tax related to payments subject to back up withholding.";
			owner_lazy = () -> com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.mmObject();
			codeName = "BWIT";
		}
	};
	final static private LinkedHashMap<String, WithholdingTaxRateTypeCode> codesByName = new LinkedHashMap<>();

	protected WithholdingTaxRateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WithholdingTaxRateTypeCode";
				definition = "Specifies the type of withholding tax rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.FATCATax, com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.NRATax,
						com.tools20022.repository.codeset.WithholdingTaxRateTypeCode.BackUpWithholding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FATCATax.getCodeName().get(), FATCATax);
		codesByName.put(NRATax.getCodeName().get(), NRATax);
		codesByName.put(BackUpWithholding.getCodeName().get(), BackUpWithholding);
	}

	public static WithholdingTaxRateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WithholdingTaxRateTypeCode[] values() {
		WithholdingTaxRateTypeCode[] values = new WithholdingTaxRateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WithholdingTaxRateTypeCode> {
		@Override
		public WithholdingTaxRateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WithholdingTaxRateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}