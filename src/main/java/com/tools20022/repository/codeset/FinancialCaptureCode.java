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
import com.tools20022.repository.codeset.FinancialCaptureCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Mode for the financial capture of the transaction by the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode#Authorisation
 * FinancialCaptureCode.Authorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode#Completion
 * FinancialCaptureCode.Completion}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCaptureCode#Batch
 * FinancialCaptureCode.Batch}</li>
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
 * <li>"AUTH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialCaptureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mode for the financial capture of the transaction by the acquirer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialCaptureCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial capture of the transaction is performed by the acquirer during
	 * the authorisation exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
	 * FinancialCaptureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial capture of the transaction is performed by the acquirer during the authorisation exchange."
	 * </li>
	 * </ul>
	 */
	public static final FinancialCaptureCode Authorisation = new FinancialCaptureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authorisation";
			definition = "Financial capture of the transaction is performed by the acquirer during the authorisation exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCaptureCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Financial capture of the transaction is performed by the acquirer during
	 * the completion exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
	 * FinancialCaptureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial capture of the transaction is performed by the acquirer during the completion exchange."
	 * </li>
	 * </ul>
	 */
	public static final FinancialCaptureCode Completion = new FinancialCaptureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Completion";
			definition = "Financial capture of the transaction is performed by the acquirer during the completion exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCaptureCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Financial capture of the transaction is performed by the acquirer at the
	 * reception of a batch transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
	 * FinancialCaptureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Batch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial capture of the transaction is performed by the acquirer at the reception of a batch transfer."
	 * </li>
	 * </ul>
	 */
	public static final FinancialCaptureCode Batch = new FinancialCaptureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Batch";
			definition = "Financial capture of the transaction is performed by the acquirer at the reception of a batch transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCaptureCode.mmObject();
			codeName = "BTCH";
		}
	};
	final static private LinkedHashMap<String, FinancialCaptureCode> codesByName = new LinkedHashMap<>();

	protected FinancialCaptureCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialCaptureCode";
				definition = "Mode for the financial capture of the transaction by the acquirer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialCaptureCode.Authorisation, com.tools20022.repository.codeset.FinancialCaptureCode.Completion,
						com.tools20022.repository.codeset.FinancialCaptureCode.Batch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Authorisation.getCodeName().get(), Authorisation);
		codesByName.put(Completion.getCodeName().get(), Completion);
		codesByName.put(Batch.getCodeName().get(), Batch);
	}

	public static FinancialCaptureCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialCaptureCode[] values() {
		FinancialCaptureCode[] values = new FinancialCaptureCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialCaptureCode> {
		@Override
		public FinancialCaptureCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialCaptureCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}