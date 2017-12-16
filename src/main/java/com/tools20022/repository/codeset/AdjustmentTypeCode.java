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
import com.tools20022.repository.codeset.AdjustmentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode#Rebate
 * AdjustmentTypeCode.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode#Discount
 * AdjustmentTypeCode.mmDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode#CreditNote
 * AdjustmentTypeCode.mmCreditNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode#Surcharge
 * AdjustmentTypeCode.mmSurcharge}</li>
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
 * <li>"REBA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdjustmentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdjustmentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment is a rebate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment is a rebate."</li>
	 * </ul>
	 */
	public static final AdjustmentTypeCode Rebate = new AdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rebate";
			definition = "Adjustment is a rebate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentTypeCode.mmObject();
			codeName = "REBA";
		}
	};
	/**
	 * Adjustment is a discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment is a discount."</li>
	 * </ul>
	 */
	public static final AdjustmentTypeCode Discount = new AdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Adjustment is a discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Adjustment is a credit note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment is a credit note."</li>
	 * </ul>
	 */
	public static final AdjustmentTypeCode CreditNote = new AdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditNote";
			definition = "Adjustment is a credit note.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentTypeCode.mmObject();
			codeName = "CREN";
		}
	};
	/**
	 * Adjustment is a surcharge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SURC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Surcharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment is a surcharge."</li>
	 * </ul>
	 */
	public static final AdjustmentTypeCode Surcharge = new AdjustmentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Surcharge";
			definition = "Adjustment is a surcharge.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentTypeCode.mmObject();
			codeName = "SURC";
		}
	};
	final static private LinkedHashMap<String, AdjustmentTypeCode> codesByName = new LinkedHashMap<>();

	protected AdjustmentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REBA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdjustmentTypeCode";
				definition = "Specifies the type of adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdjustmentTypeCode.Rebate, com.tools20022.repository.codeset.AdjustmentTypeCode.Discount, com.tools20022.repository.codeset.AdjustmentTypeCode.CreditNote,
						com.tools20022.repository.codeset.AdjustmentTypeCode.Surcharge);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Rebate.getCodeName().get(), Rebate);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(CreditNote.getCodeName().get(), CreditNote);
		codesByName.put(Surcharge.getCodeName().get(), Surcharge);
	}

	public static AdjustmentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdjustmentTypeCode[] values() {
		AdjustmentTypeCode[] values = new AdjustmentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdjustmentTypeCode> {
		@Override
		public AdjustmentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdjustmentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}