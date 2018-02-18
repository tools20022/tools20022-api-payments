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
import com.tools20022.repository.codeset.AdjustmentDirectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the adjustment is added or substracted to the total amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode#Added
 * AdjustmentDirectionCode.Added}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode#Substracted
 * AdjustmentDirectionCode.Substracted}</li>
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
 * <li>"ADDD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdjustmentDirectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the adjustment is added or substracted to the total amount."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdjustmentDirectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment amount must be added to the total amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Added"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment amount must be added to the total amount."</li>
	 * </ul>
	 */
	public static final AdjustmentDirectionCode Added = new AdjustmentDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Added";
			definition = "Adjustment amount must be added to the total amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentDirectionCode.mmObject();
			codeName = "ADDD";
		}
	};
	/**
	 * Adjustment amount must be substracted from the total amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Substracted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment amount must be substracted from the total amount."</li>
	 * </ul>
	 */
	public static final AdjustmentDirectionCode Substracted = new AdjustmentDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Substracted";
			definition = "Adjustment amount must be substracted from the total amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdjustmentDirectionCode.mmObject();
			codeName = "SUBS";
		}
	};
	final static private LinkedHashMap<String, AdjustmentDirectionCode> codesByName = new LinkedHashMap<>();

	protected AdjustmentDirectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADDD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdjustmentDirectionCode";
				definition = "Specifies whether the adjustment is added or substracted to the total amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdjustmentDirectionCode.Added, com.tools20022.repository.codeset.AdjustmentDirectionCode.Substracted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Added.getCodeName().get(), Added);
		codesByName.put(Substracted.getCodeName().get(), Substracted);
	}

	public static AdjustmentDirectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdjustmentDirectionCode[] values() {
		AdjustmentDirectionCode[] values = new AdjustmentDirectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdjustmentDirectionCode> {
		@Override
		public AdjustmentDirectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdjustmentDirectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}