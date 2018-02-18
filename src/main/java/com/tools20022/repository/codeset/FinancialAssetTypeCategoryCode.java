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
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Categorization of financial asset type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#Equities
 * FinancialAssetTypeCategoryCode.Equities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#DebtInstruments
 * FinancialAssetTypeCategoryCode.DebtInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#Entitlements
 * FinancialAssetTypeCategoryCode.Entitlements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#Derivatives
 * FinancialAssetTypeCategoryCode.Derivatives}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#MoneyMarket
 * FinancialAssetTypeCategoryCode.MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode#Others
 * FinancialAssetTypeCategoryCode.Others}</li>
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
 * <li>"EQTY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAssetTypeCategoryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Categorization of financial asset type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialAssetTypeCategoryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to equities."</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode Equities = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equities";
			definition = "Balance attributed to equities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Balance attributed to debt instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstruments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to debt instruments."</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode DebtInstruments = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtInstruments";
			definition = "Balance attributed to debt instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Balance attributed to entitlements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to entitlements."</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode Entitlements = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitlements";
			definition = "Balance attributed to entitlements.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "ENTL";
		}
	};
	/**
	 * Balance attributed to derivatives.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DERV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivatives"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to derivatives."</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode Derivatives = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivatives";
			definition = "Balance attributed to derivatives.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "DERV";
		}
	};
	/**
	 * Balance attributed to money market instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to money market instruments."</li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode MoneyMarket = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Balance attributed to money market instruments.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "MMKT";
		}
	};
	/**
	 * Other financial asset type balance according to a different
	 * classification, which is not explictly defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Others"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other financial asset type balance according to a different classification, which is not explictly defined."
	 * </li>
	 * </ul>
	 */
	public static final FinancialAssetTypeCategoryCode Others = new FinancialAssetTypeCategoryCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Others";
			definition = "Other financial asset type balance according to a different classification, which is not explictly defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, FinancialAssetTypeCategoryCode> codesByName = new LinkedHashMap<>();

	protected FinancialAssetTypeCategoryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EQTY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetTypeCategoryCode";
				definition = "Categorization of financial asset type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Equities, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.DebtInstruments,
						com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Entitlements, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Derivatives,
						com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.MoneyMarket, com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode.Others);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Equities.getCodeName().get(), Equities);
		codesByName.put(DebtInstruments.getCodeName().get(), DebtInstruments);
		codesByName.put(Entitlements.getCodeName().get(), Entitlements);
		codesByName.put(Derivatives.getCodeName().get(), Derivatives);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Others.getCodeName().get(), Others);
	}

	public static FinancialAssetTypeCategoryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialAssetTypeCategoryCode[] values() {
		FinancialAssetTypeCategoryCode[] values = new FinancialAssetTypeCategoryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialAssetTypeCategoryCode> {
		@Override
		public FinancialAssetTypeCategoryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialAssetTypeCategoryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}