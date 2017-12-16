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
import com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Automatic Reinvestment of Cash distributed by accumulating funds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode#Final
 * CorporateActionFrequencyTypeCode.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode#Interim
 * CorporateActionFrequencyTypeCode.mmInterim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode#Regular
 * CorporateActionFrequencyTypeCode.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode#Special
 * CorporateActionFrequencyTypeCode.mmSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode#FundCashDistributionReinvestment
 * CorporateActionFrequencyTypeCode.mmFundCashDistributionReinvestment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FINL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionFrequencyTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Automatic Reinvestment of Cash distributed by accumulating funds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionFrequencyTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment of a dividend, less amounts already paid through interim
	 * dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of a dividend, less amounts already paid through interim dividends."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeCode Final = new CorporateActionFrequencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "Payment of a dividend, less amounts already paid through interim dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Dividend declared and paid before annual earnings have been determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend declared and paid before annual earnings have been determined."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeCode Interim = new CorporateActionFrequencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Dividend declared and paid before annual earnings have been determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Dividend paid at regular interval, for example, quarterly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend paid at regular interval, for example, quarterly."</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeCode Regular = new CorporateActionFrequencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Dividend paid at regular interval, for example, quarterly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.mmObject();
			codeName = "REGR";
		}
	};
	/**
	 * Dividend in addition to the regular dividend being paid by the company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend in addition to the regular dividend being paid by the company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeCode Special = new CorporateActionFrequencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Dividend in addition to the regular dividend being paid by the company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Automatic Reinvestment of Cash distributed by accumulating funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundCashDistributionReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automatic Reinvestment of Cash distributed by accumulating funds."</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeCode FundCashDistributionReinvestment = new CorporateActionFrequencyTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundCashDistributionReinvestment";
			definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.mmObject();
			codeName = "REIN";
		}
	};
	final static private LinkedHashMap<String, CorporateActionFrequencyTypeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionFrequencyTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FINL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyTypeCode";
				definition = "Automatic Reinvestment of Cash distributed by accumulating funds.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Final, com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Interim,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Regular, com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.Special,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode.FundCashDistributionReinvestment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(FundCashDistributionReinvestment.getCodeName().get(), FundCashDistributionReinvestment);
	}

	public static CorporateActionFrequencyTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionFrequencyTypeCode[] values() {
		CorporateActionFrequencyTypeCode[] values = new CorporateActionFrequencyTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionFrequencyTypeCode> {
		@Override
		public CorporateActionFrequencyTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionFrequencyTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}